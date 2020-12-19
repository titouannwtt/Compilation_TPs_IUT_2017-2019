	.arm
	.align 2
	.data
	.text
	.globl _start

_start:
	nop
	mov r0,#64
	add r1,r0,r0,lsr #3
	nop

	mov r0,r1
	mov r7,#1
	swi 0x0

.end
