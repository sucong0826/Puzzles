package puzzle_mode.mode_factory.methodfactory;

import puzzle_mode.mode_factory.simplefactory.AbstractSoap;
import puzzle_mode.mode_factory.simplefactory.SulphurSoap;

/**
 * Created by SuCong on 2015/09/17.
 */
public class SulphurSoapFactory implements AbstractSoapFactory {

    @Override
    public AbstractSoap produceSoap() {
        return new SulphurSoap();
    }
}
