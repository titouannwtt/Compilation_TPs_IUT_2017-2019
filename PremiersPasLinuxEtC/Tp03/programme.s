	.file	"racine.c"
	.text
	.globl	main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$9, -4(%rbp)
	cvtsi2sd	-4(%rbp), %xmm0
	call	sqrt
	cvttsd2si	%xmm0, %eax
	movl	%eax, -8(%rbp)
	movl	-8(%rbp), %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.ident	"GCC: (GNU) 7.1.1 20170621"
	.section	.note.GNU-stack,"",@progbits
