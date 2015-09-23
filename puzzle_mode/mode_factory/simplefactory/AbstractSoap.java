package puzzle_mode.mode_factory.simplefactory;

/**
 * 这是抽象产品的部分，这里我们就将Soap定义为一个抽象类，以方便其子类可以或多扩展更多父类的信息。
 * <p>
 * Created by SuCong on 2015/09/17.
 */
public abstract class AbstractSoap {
    protected String material;
    protected String shape;
    protected double price;
    protected int flavor;
    protected int type;

    /**
     * What kinds of people will be adapted;
     *
     * @return adapted people
     */
    protected abstract String[] adaptedCrowds(int type);

    /**
     * An abstract method about what are functions added.
     * Each type of soap have a kind of function;
     */
    protected abstract void functions(int type);

    protected String getMaterial() {
        return material;
    }

    protected void setMaterial(String material) {
        this.material = material;
    }

    protected String getShape() {
        return shape;
    }

    protected void setShape(String shape) {
        this.shape = shape;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getFlavor() {
        return flavor;
    }

    protected void setFlavor(int flavor) {
        this.flavor = flavor;
    }

    protected int getType() {
        return type;
    }

    protected void setType(int type) {
        this.type = type;
    }
}
