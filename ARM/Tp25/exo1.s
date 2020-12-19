	.arm
	.align 2
	.data
		

		prompt1: .asciz "\n"
		len1 = . - prompt1


	.text
	.globl _start

C:
	push {lr}
	cmp r1,#0
	beq fin
	cmp r1,r0
	beq fin
	push {r0,r1}
	sub r0,r0,#1
	bl C
	mov r10,r0
	pop {r0,r1}
	push {r10}
	sub r0,r0,#1
	sub r1,r1,#1
	bl C
	pop {r1}
	add r0,r0,r1
	pop {pc}
	fin:
	mov r0,#1
	pop {pc}

_start:
	mov r0,#4
	mov r1,#2
	bl C

	mov r7,#1
	swi 0x0

.end
