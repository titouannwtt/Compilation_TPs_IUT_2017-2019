	.arm
	.text
	.globl _start
_start:
	mov r1,#7
	mov r2,#8
	add r3,r1,r2
	mov r7,#1
	swi 0x0
.end
