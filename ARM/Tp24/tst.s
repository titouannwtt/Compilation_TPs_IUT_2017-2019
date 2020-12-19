.set SWI_Open, 0x5
.set SWI_Close, 0x6
.set SWI_Read, 0x3

.align 2
.data
errmsg : .asciz "Oh shit, an error as occured.\n"
len = . - errmsg
infile : .asciz "args.dat"
rdonly : .word 0x0
perm : .word 0x124
tab : .space  24			@ REMPLACER 24 par le nombre d'octet dans le fichier

.text
.globl _start

_start :
	b prog
	
	err:			@ERROR MESSAGE + EXIT
		mov r0,#1		@ ERROR MESSAGE
		ldr r1,=errmsg
		ldr r2,=len
		
		mov r7,#4
		swi 0x0

		mov r7,#1		@ EXIT
		mov r0,#1
		swi 0x0

	prog: 			@PROGRAMME
		ldr r0, =infile		@ OPEN
		ldr r1, =rdonly
		ldr r1, [r1]
		ldr r2, =perm
		ldr r2, [r2]
		mov r7, #SWI_Open
		swi 0x0
		cmp r0,#0xfffffffe
		beq err
		
		mov r10, r0			@Sauvegarde la valeur de open dans r10

		ldr r1, =tab
		mov r2, #24
		mov r7, #SWI_Read	@ READ
		swi 0x0
		cmp r0,#0xfffffffe
		beq err
		
		mov r3, r0
	
		mov r0, r10  		@ CLOSE
		mov r7, #SWI_Close
		swi 0x0
		cmp r0,#0xfffffffe
		beq err
	
		ldr r1,=tab
		add r1, r1, #12
		ldr r1, [r1]
	
		mov r0, r1		@ EXIT
		mov r7, #1
		swi 0x0
.end
