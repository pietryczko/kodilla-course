package patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "You send snapchat";
    }
}
