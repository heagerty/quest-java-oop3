public interface Fly {


	void takeOff();

	int ascend(int meters);

	int descend(int meters);

	void land();

	default void glide() {
		System.out.printf("It glides into the air.%n");
	}

}
