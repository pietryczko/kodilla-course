package patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "You post a tweet";
    }
}
