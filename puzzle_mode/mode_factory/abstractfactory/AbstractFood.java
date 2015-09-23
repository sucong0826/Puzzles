package puzzle_mode.mode_factory.abstractfactory;

/**
 * 抽象产品的抽象类;
 * <p>
 * Created by SuCong on 2015/09/18.
 */
public abstract class AbstractFood {
    protected boolean quality;

    public abstract void processFood(boolean quality);
}
