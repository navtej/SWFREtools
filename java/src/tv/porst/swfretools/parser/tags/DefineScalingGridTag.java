package tv.porst.swfretools.parser.tags;

import tv.porst.swfretools.parser.structures.RecordHeader;
import tv.porst.swfretools.parser.structures.Rect;

public class DefineScalingGridTag extends Tag {

	public DefineScalingGridTag(final RecordHeader header, final int characterId,
			final Rect splitter) {
		super(header);
	}

}