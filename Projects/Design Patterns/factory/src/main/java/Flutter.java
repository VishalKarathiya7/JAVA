public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }
    public UIFactory createUIFactory(){
        return UiFactoryFactory.getUiFactoryFromPlatform(supportedPlatform);
    }
}
