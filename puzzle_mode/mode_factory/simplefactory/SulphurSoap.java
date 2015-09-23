package puzzle_mode.mode_factory.simplefactory;

/**
 * Sulphur Soap is a kind of soap we used normally;
 * <p>
 * Created by SuCong on 2015/09/17.
 */
public class SulphurSoap extends AbstractSoap {
    private String mixMaterial;

    public SulphurSoap() {
        functions(super.type);
    }

    @Override
    protected String[] adaptedCrowds(int type) {
        return new String[]{"Doctors", "Nurse"};
    }

    @Override
    protected void functions(int type) {
        System.out.println("SulphurSoap can disinfect and inhibit virus!");
    }

    public String getMixMaterial() {
        return mixMaterial;
    }

    public void setMixMaterial(String mixMaterial) {
        this.mixMaterial = mixMaterial;
    }
}
