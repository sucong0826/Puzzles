package puzzle_mode.mode_factory.simplefactory;

/**
 * Clothing soap can be used when people wash cloth manually.
 * <p>
 * Created by SuCong on 2015/09/17.
 */
public class ClothingSoap extends AbstractSoap {

    @Override
    protected String[] adaptedCrowds(int type) {
        return new String[]{"Women", "Worker"};
    }

    @Override
    protected void functions(int type) {
        System.out.println("ClothingSoap is used to wash cloth and hands.");
    }
}
