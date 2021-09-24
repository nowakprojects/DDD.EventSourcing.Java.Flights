package pl.zycienakodach.pragmaticflights.shared.application.eventstore;

sealed public class ExpectedStreamVersion permits ExpectedStreamVersion.Any, ExpectedStreamVersion.NotExists, ExpectedStreamVersion.Exactly {
  public static final class Any extends ExpectedStreamVersion {

  }

  public static final class NotExists extends ExpectedStreamVersion {

  }

  public static final class Exactly extends ExpectedStreamVersion {
    private final int raw;

    public Exactly(int raw) {
      this.raw = raw;
    }

    public int raw() {
      return raw;
    }
  }
}