package puzzle_mode.mode_factory.abstractfactory;

/**
 * Created by SuCong on 2015/09/18.
 */
public class CarsFactory extends AbstractFactory {

    @Override
    public AbstractFood createFood() {
        return null;
    }

    @Override
    public AbstractCars createCars() {
        return null;
    }
}
