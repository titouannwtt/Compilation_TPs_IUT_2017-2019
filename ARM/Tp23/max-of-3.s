	.arm
	.align 2
	.data

		a: .word 59
		b: .word 88
		c: .word 2

	.text
	.globl _start
_start:
	ldr r1,=a
	ldr r1,[r1]
	ldr r2,=b
	ldr r2,[r2]
	ldr r3,=c
	ldr r3,[r3]






	mov r4,r1 	@r1 devient le plus grand (r1 devient r4)

	cmp r1,r2 	@Si r1 est plus grand que r2,
	movlt r4,r1	@Alors on met r1 dans r4, (r2 devient r4)

	mov r5,r4	@On met r5 dans r4 (r5 devient le max)

	cmp r3,r4	@Si r3 est plus grand r4 (le plus grand entre "a" et "b")
	movlt r5,r3	@Alors on met r1 dans r5, sinon r5 reste r4


	mov r0,r5
	mov r7,#1
	swi 0x0
.end
