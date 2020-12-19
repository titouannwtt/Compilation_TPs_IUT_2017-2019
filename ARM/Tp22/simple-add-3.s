	.arm
	.align 2
	.data

fst: .word 1
scd: .word 2	
	.text
	.globl _start
_start:
	ldr r2,=fst
	ldr r2,[r2]
	ldr r3,=scd
	ldr r3,[r3]

	add r0,r2,r3
	mov r7,#1
	swi 0x0
.end
