public class UiFactoryFactory {
    public static UIFactory getUiFactoryFromPlatform(SupportedPlatform supportedPlatform){
        if(supportedPlatform == SupportedPlatform.ANDROID){
            return new AndroidUiFactory();
        }else if(supportedPlatform == SupportedPlatform.IOS){
            return new IosUiFactory();
        }
        return null;
    }
}
