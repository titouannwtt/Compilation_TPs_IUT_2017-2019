.data
infile: .asciz "args.dat"			@Fichier à ouvrir
outfile: .asciz "result.dat"			@Fichier où écrire
a: .word 0					@valeur pour stocker l'ID fichier 1
b: .word 0					@valeur pour stocker l'ID fichier 2
r: .word 0					@valeur pour stocker le résultat de l'addition
perm: .word 0x242				@permission d'ouverture du fichier
err: .word 0xfffffffe

.text
.globl _start

_start:
	ldr r0,=infile
	mov r1,#0
	mov r2,#0x1a4
	mov r7,#5
	swi 0x0
	ldr r4,=err
	ldr r5,[r4]
	cmp r0,r5
	beq l1

	mov r10,r0
	ldr r1,=a
	mov r2,#4
	mov r7,#3
	swi 0x0
	mov r0,r10
	ldr r1,=b
	swi 0x0

	ldr r0,=a
	ldr r1,[r0]
	ldr r0,=b
	ldr r2,[r0]
	add r3,r1,r2
	ldr r0,=r
	str r3,[r0]	
	ldr r0,=outfile
	ldr r1,=0x241
	mov r2,#0x1a4
	mov r7,#5
	swi 0x0
	cmp r0,r5
	beq l1
	ldr r1,=r
	mov r2,#4
	mov r7,#4
	swi 0x0
	l1:
	mov r7,#1
	swi 0x0
.end
