package tv.porst.swfretools.parser.actions.as3;

import tv.porst.splib.binaryparser.UINT8;
import tv.porst.swfretools.parser.structures.EncodedS24;

public class AS3Iffalse extends AS3Instruction {

	public AS3Iffalse(final UINT8 opcode, final EncodedS24 offset) {
		super(opcode);
	}

}