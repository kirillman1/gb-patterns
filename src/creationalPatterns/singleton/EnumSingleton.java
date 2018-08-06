package creationalPatterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString (){
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
