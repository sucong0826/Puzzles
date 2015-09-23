package puzzle_mode.mode_factory.methodfactory;

import puzzle_mode.mode_factory.simplefactory.AbstractSoap;

/**
 * 工厂方法模式相对于简单工厂模式来说，我们把原工厂类抽象出来，然后让工厂子类来完成工厂类的操作。
 * 这样下发下去之后，工厂类就会满足了开闭原则，同时再有新的产品需要生成的时候，对应的创建一个抽象工厂子类的对象就可以了。
 * Created by SuCong on 2015/09/17.
 */
public interface AbstractSoapFactory {
    AbstractSoap produceSoap();
}
