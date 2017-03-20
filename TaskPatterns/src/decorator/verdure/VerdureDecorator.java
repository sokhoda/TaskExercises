package decorator.verdure;

import decorator.Pie;

public abstract class VerdureDecorator extends Pie {
	String collectionYear;
	int cutting;

	@Override
	public abstract String getDescription();

	public abstract void cut(int type);

}
