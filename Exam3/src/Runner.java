import java.time.LocalDate;
import java.util.Random;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {





	public static void main(String[] args) throws IOException, ClassNotFoundException{

		Food food1=new Food("f1", Taste.BITTER, MacronutrientsCategory.FAT);
		Food food2=new Food("f2", Taste.SALTY, MacronutrientsCategory.PROTEIN);

		Dragon drag1=new Dragon("d1", LocalDate.of(2020, 1, 8),2);
		Dragon drag2=new Dragon("d2", LocalDate.of(880, 1, 10),5);



		selectAndSaveToFile(food1,food2,drag1,drag2);
		selectAndSaveToFile(food1,food2,drag1,drag2);
		ObjectReaderDemo();

	}

	

	public static void selectAndSaveToFile(Object o1, Object o2, Object o3, Object o4) throws FileNotFoundException, IOException {
		 Random rand = new Random();
		 int rand_int1 = rand.nextInt(3);
		
		 if(rand_int1==0)
			 SaveToFile(o1);
		 
		 else if(rand_int1==1)
			 SaveToFile(o2);
		 
		 else if(rand_int1==2)
			 SaveToFile(o3);
		 else
			 SaveToFile(o4);
		 
	}

	public static void SaveToFile(Object o) throws FileNotFoundException, IOException {

		try (FileOutputStream fileOut = new FileOutputStream("file2.dat");
				// Creates an ObjectOutputStream
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

			objOut.writeObject(o);
		}
	}


	private static void ObjectReaderDemo() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try (FileInputStream file = new FileInputStream("file2.dat");
				// Creates an ObjectOutputStream
				ObjectInputStream objStream = new ObjectInputStream(file);) {
			System.out.println( objStream.readObject());
		}
	}





}
