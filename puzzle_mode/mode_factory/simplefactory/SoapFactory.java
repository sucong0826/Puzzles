package puzzle_mode.mode_factory.simplefactory;

/**
 * When some manufacturers want to produce a kind of soap, our factory can provide
 * two kinds of soap, one is SulphurSoap, the other is ClothingSoap.
 * If they need a kind which we cannot produce, Sorry, we cannot do that.
 * else what they need is we have, Okay, we can provide.
 * <p>
 * Created by SuCong on 2015/09/17.
 */
public class SoapFactory {

    /**
     * Get a clothing soap instance;
     *
     * @return an object of clothing soap
     */
    public static ClothingSoap getClothSoap() {
        return new ClothingSoap();
    }

    public static SulphurSoap getSulphurSoap() {
        return new SulphurSoap();
    }
}
