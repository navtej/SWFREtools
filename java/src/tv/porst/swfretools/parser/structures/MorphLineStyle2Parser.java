package tv.porst.swfretools.parser.structures;

import tv.porst.splib.io.BinaryParser;

public class MorphLineStyle2Parser {

	public static MorphLineStyle2 parse(final BinaryParser parser) {
		final int startWidth = parser.readUInt16();
		final int endWidth = parser.readUInt16();
		final int startCapStyle = parser.readBits(2);
		final int joinStyle = parser.readBits(2);
		final boolean hasFillFlag = parser.readFlag();
		final boolean noHScaleFlag = parser.readFlag();
		final boolean noVScaleFlag = parser.readFlag();
		final boolean pixelHintingFlag = parser.readFlag();
		final int reserved = parser.readBits(5);
		final boolean noClose = parser.readFlag();
		final int endCapStyle = parser.readBits(2);
		final int miterLimitFactor = joinStyle == 2 ? parser.readUInt16() : 0;
		final RGBA startColor = !hasFillFlag ? RGBAParser.parse(parser) : null;
		final RGBA endColor = !hasFillFlag ? RGBAParser.parse(parser) : null;
		final MorphFillStyle fillType = hasFillFlag ? MorphFillStyleParser.parse(parser) : null;

		return new MorphLineStyle2(startWidth, endWidth, startCapStyle, joinStyle, hasFillFlag,
				noHScaleFlag, noVScaleFlag, pixelHintingFlag, reserved, noClose, endCapStyle,
				miterLimitFactor, startColor, endColor, fillType);
	}

}