
public class TestGeneration 
{
	public static void main(String[] args) {
		FirstGeneration fg = new FirstGeneration();
		fg.call();
		fg.message();
		SecondGeneration sg = new SecondGeneration();
		sg.call();
		sg.message();
		sg.radio();
		ThirdGeneration tg = new ThirdGeneration();
		tg.call();
		tg.message();
		tg.radio();
		tg.camera();
	}

}
