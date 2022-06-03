/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */

	public static void testEncoder()
	  {
	    Picture beach = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/beach.jpg");

	    beach.explore();
	    beach.encode();
	    beach.explore();
	    beach.decode();
	    beach.explore();
	  }
	
	public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal() 
  {
	  Picture caterpillar = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontal();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() 
  {
	  Picture caterpillar = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontalBotToTop();
	  caterpillar.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture caterpillar = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorDiagonal();
	  caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the collage method */
  public static void testCopy()
  {
    Picture canvas = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testmyCollage()
  {
	  Picture canvas = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
  }
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/ishandeshpande/Documents/GitHub/deshpande_ishan_apcsa-2022/Unit16/src/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  testEncoder();
//	  	//testZeroBlue();
//	    testKeepOnlyBlue();
////	    testKeepOnlyRed();
//	    //testKeepOnlyGreen();
//	    //testNegate();
//	    //testGrayscale();
//	    //testFixUnderwater();
//	    testMirrorVertical();
//	    //testMirrorTemple();
//	    //testMirrorArms();
//	    //testMirrorGull();
//	    //testMirrorDiagonal();
//	    //testCollage();
//	    //testCopy();
//	    testEdgeDetection();
//	    //testEdgeDetection2();
//	    //testChromakey();
//	    //testEncodeAndDecode();
//	    //testGetCountRedOverValue(250);
//	    //testSetRedToHalfValueInTopHalf();
//	    //testClearBlueOverValue(200);
//	    //testGetAverageForColumn(0);
  }
}