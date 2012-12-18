class SingletonFactory implements Soldierab {
  private Gunner testgunner;

  public synchronized Gunner speak() {
    if (this.testgunner == null) {
     testgunner = new Gunner();
    }
    return testgunner;
  }
}
