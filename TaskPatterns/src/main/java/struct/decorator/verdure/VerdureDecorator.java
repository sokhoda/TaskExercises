package struct.decorator.verdure;

import struct.decorator.Pie;

public abstract class VerdureDecorator extends Pie {
	String collectionYear;
	int cutting;

	@Override
	public abstract String getDescription();

	public abstract void cut(int type);

}
