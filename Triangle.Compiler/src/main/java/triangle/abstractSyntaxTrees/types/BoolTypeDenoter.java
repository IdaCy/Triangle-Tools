/*
 * @(#)BoolTypeDenoter.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package triangle.abstractSyntaxTrees.types;

import triangle.abstractMachine.Machine;
import triangle.abstractSyntaxTrees.visitors.TypeDenoterVisitor;
import triangle.syntacticAnalyzer.SourcePosition;

public class BoolTypeDenoter extends TypeDenoter {

	public BoolTypeDenoter(SourcePosition position) {
		super(position);
	}

	public <TArg, TResult> TResult visit(TypeDenoterVisitor<TArg, TResult> v, TArg arg) {
		return v.visitBoolTypeDenoter(this, arg);
	}
	
	@Override
	public int getSize() {
		return Machine.booleanSize;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj != null) && (obj instanceof ErrorTypeDenoter)) {
			return true;
		} else {
			return ((obj != null) && (obj instanceof BoolTypeDenoter));
		}
	}
}
