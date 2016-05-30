/**
 * Limits numbers so entities don't move off grid (borrowed from SO)
 */
public class Limit {

    public static int limit(int value) {
        return Math.max(1, Math.min(value, 10));
    }

}
