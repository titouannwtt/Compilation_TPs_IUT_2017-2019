	.arm
	.align 2
	.data
		

		prompt1: .asciz "Input file: \n"
		len1 = . - prompt1


	.text
	.globl _start

_start:
	mov r0,#1 		@ Pour dire d'écrire dans stdout ( 1 )
	ldr r1,=prompt1		@ Pour 
	ldr r2,=len1	

	mov r7,#4
	swi 0x0

	mov r7,#1
	mov r0,#1
	swi 0x0

.end
