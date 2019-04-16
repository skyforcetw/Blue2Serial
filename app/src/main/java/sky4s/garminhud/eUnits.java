package sky4s.garminhud;

/**
 * Created by skyforce on 2018/8/13.
 */

public enum eUnits {
    None(0),
    Metres(1),
    Kilometres(3),
    Miles(5),
    Foot(8);

    final public int value;

    eUnits(int value) {
        this.value = value;
    }
}
