package puzzle_mode.mode_factory.abstractfactory;

/**
 * 抽象公共类;
 * <p>
 * Created by SuCong on 2015/09/18.
 */
public abstract class AbstractFactory {
    public abstract AbstractFood createFood();

    public abstract AbstractCars createCars();
}
