	.arm
	.align 2
	.data

		a: .word 15 	@Nombre à diviser
		b: .word 3 	@Diviseur

	.text
	.globl _start

	reduce:
		push {lr}
		sub r1,r1,r2
		add r4,r4,#1
		pop {pc}


_start:
	ldr r1,=a	@r1 est le nombre à diviser
	ldr r1,[r1]
	ldr r2,=b 	@r2 est le diviseur
	ldr r2,[r2]
	mov r4,#0	@r4 sert de compteur.

	loop:
		cmp r1,r2 		@ Si r1 est plus petit que r2,
		blt fin			@ Alors on va à la fin, sinon:
			bl reduce		@ On réduit le nombre à diviser de une fois le diviseur, et on ajoute 1 au compteur
			b loop		@ Boucler à l'étiquette loop

	fin:
		mov r0,r4		@ Donne comme valeur de retour, le compteur r4 pour exit
		mov r7,#1		@ Permet de faire un exit
		swi 0x0			@ Termine le programme
.end
