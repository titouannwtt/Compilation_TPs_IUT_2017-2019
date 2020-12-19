	.arm
	.align 2
	.set SWI_Open,0x5
	.data
		
		outfile: .asciz "result.dat"

	.text
	.globl _start

_start:
	ldr r0,=outfile		@Argument 1,  nom du fichier
	mov r1,#0x3		@Argument 2 (0_RDONLY) (0011)
	mov r2,#0x124		@Argument 3 ("0444")
	mov r7,#SWI_open	@Met dans r7 le numéro d'appel système
	swi #0			@Lance l'appel système (open)
	cmp r0,#0
	blt 




	mov r0,#1 		@ Pour dire d'écrire dans stdout ( 1 )
	ldr r1,=prompt1		@ Pour 
	ldr r2,=len1	

	mov r7,#4
	swi 0x0

	mov r7,#1
	mov r0,#1
	swi 0x0

.end
