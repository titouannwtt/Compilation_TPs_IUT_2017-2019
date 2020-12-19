@ n  -> r1
@ k  -> r2
@ x1 -> r3
@ x2 -> r4
@ Arguments -> r1,r2
@ resultat intermediaire -> r3
@ Sauvegarder et restituer -> r1, r2, r4

.arm
.data
.text
.globl _start

binoco:
	push {r1,r2,r4,lr}
	cmp r1,#0
	beq L
	cmp r1,r2
	beq L
	sub r1,r1,#1
	bl binoco
	sub r2,r2,#1
	bl binoco
	mov r4,r3
	add r2,r2,#1
	add r3,r3,r4
	pop {r1,r2,r4,pc}
L:
	mov r3,#1
	pop {r1,r2,r4,pc}

_start:
	mov r1,#3
	mov r2,#5
	bl binoco
	mov r7,#1
	swi 0x0
.end
