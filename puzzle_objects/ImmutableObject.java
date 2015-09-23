package puzzle_objects;

import java.util.Arrays;

/**
 * This is an immutable object
 * <p/>
 * Created by SuCong on 2015/9/11.
 */
public class ImmutableObject {
    private String createTime;
    private String createAuthor;
    private char[] svnSerial;
    private int gender;

    public ImmutableObject(String createTime, String createAuthor, char[] svnSerial, int gender) {
        this.createTime = createTime;
        this.createAuthor = createAuthor;
        this.svnSerial = svnSerial;
        this.gender = gender;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getCreateAuthor() {
        return createAuthor;
    }

    public char[] getSvnSerial() {
        return svnSerial;
    }

    public int getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ImmutableObject{" +
                "createTime='" + createTime + '\'' +
                ", createAuthor='" + createAuthor + '\'' +
                ", svnSerial=" + Arrays.toString(svnSerial) +
                ", gender=" + gender +
                '}';
    }
}
