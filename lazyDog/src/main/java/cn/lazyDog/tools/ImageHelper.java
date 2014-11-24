package cn.lazyDog.tools;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class ImageHelper {
	private static String[] chars={"1","2","3","4","5","6","7","8","9","0"};
	 
	public static String GetValidateCode(int size) {
		StringBuilder sb = new StringBuilder();
		Random ran=new Random();
		for (int i = 0; i < size; i++) {
			int r=ran.nextInt(chars.length);
			sb.append(chars[r]);
			}
		return sb.toString();
	}
	
	public static BufferedImage resize(BufferedImage source, int targetW, int targetH) {
         // targetW，targetH分别表示目标长和宽
         int type = source.getType();
         BufferedImage target = null;
         double sx = (double) targetW / source.getWidth();
         double sy = (double) targetH / source.getHeight();
         //这里想实现在targetW，targetH范围内实现等比缩放。如果不需要等比缩放
         //则将下面的if else语句注释即可
         if(sx>sy)
         {
             sx = sy;
             targetW = (int)(sx * source.getWidth());
         }else{
             sy = sx;
             targetH = (int)(sy * source.getHeight());
         }
         if (type == BufferedImage.TYPE_CUSTOM) { //handmade
             ColorModel cm = source.getColorModel();
             WritableRaster raster = cm.createCompatibleWritableRaster(targetW, targetH);
             boolean alphaPremultiplied = cm.isAlphaPremultiplied();
             target = new BufferedImage(cm, raster, alphaPremultiplied, null);
         } else
             target = new BufferedImage(targetW, targetH, type);
             Graphics2D g = target.createGraphics();
             //smoother than exlax:
             g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY );
             g.drawRenderedImage(source, AffineTransform.getScaleInstance(sx, sy));
             g.dispose();
             return target;
         }
     
         public static void saveImageAsJpg (String fromFileStr,String saveToFileStr,int width,int hight)
         throws Exception {
         BufferedImage srcImage;
         // String ex = fromFileStr.substring(fromFileStr.indexOf("."),fromFileStr.length());
         String imgType = "JPEG";
         if (fromFileStr.toLowerCase().endsWith(".png")) {
             imgType = "PNG";
         }
         // System.out.println(ex);
         File saveFile=new File(saveToFileStr);
         File fromFile=new File(fromFileStr);
         srcImage = ImageIO.read(fromFile);
         if(width > 0 || hight > 0)
         {
             //srcImage = resize(srcImage, width, hight);
        	 srcImage=reduce(srcImage,width,hight,true);
         }
         ImageIO.write(srcImage, imgType, saveFile);

     }
         
         public static BufferedImage reduce(final BufferedImage srcImg,
        		   final int targetW, final int targetH, boolean sameRate)
        		 {
        		  if (srcImg == null)
        		   return null;
        		  double sx = (double) targetW / srcImg.getWidth();
        		  double sy = (double) targetH / srcImg.getHeight();
        		  int myTargetW = targetW;
        		  int myTargetH = targetH;
        		  // 这里想实现在targetW，targetH范围内实现等比缩放。如果不需要等比缩放
        		  // 则将下面的if else语句注释即可
        		  if (sameRate)
        		  {
        		   if (sx > sy)
        		   {
        		    sx = sy;
        		    myTargetW = (int) (sx * srcImg.getWidth());
        		   }
        		   else
        		   {
        		    sy = sx;
        		    myTargetH = (int) (sy * srcImg.getHeight());
        		   }
        		  }
        		  final Image rescaled = srcImg.getScaledInstance(myTargetW, myTargetH,
        		    Image.SCALE_AREA_AVERAGING);
        		  final BufferedImage result = new BufferedImage(myTargetW, myTargetH,
        		    BufferedImage.TYPE_INT_RGB);
        		  final Graphics2D g = result.createGraphics();
        		  g.drawImage(rescaled, 0, 0, null);
        		  g.dispose();
        		  return result;
     }
     
     public static void main (String argv[]) {
         try{
         //参数1(from),参数2(to),参数3(宽),参数4(高)
//             saveImageAsJpg("E:\\windfarmPhotos\\ah_yy_01.png",
//                     "E:\\缩略图\\ah_yy_01.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\hb-jf02.png",
//                     "E:\\缩略图\\hb-jf02.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\hb-jf03.png",
//                     "E:\\缩略图\\hb-jf03.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\hb_xf_04.png",
//                     "E:\\缩略图\\hb_xf_04.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\hb_xf_05.png",
//                     "E:\\缩略图\\hb_xf_05.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\gdyy_06.png",
//                     "E:\\缩略图\\gdyy_06.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\gdyy_07.png",
//                     "E:\\缩略图\\gdyy_07.png",
//                     100,78);
//             saveImageAsJpg("E:\\windfarmPhotos\\gdyy_08.png",
//                     "E:\\缩略图\\gdyy_08.png",
//                     100,78);
         } catch(Exception e){
             e.printStackTrace();
         }
//    	 File file =new File("E:\\windfarmPhotos");
//    	 if(file.isDirectory()){
//    		 String[] filelist = file.list();
//    		 for (int i = 0; i < filelist.length; i++) {
//    			 try{
//    	             saveImageAsJpg("E:\\windfarmPhotos\\"+filelist[i],
//                   "E:\\windfarmPhotos_small\\"+filelist[i],
//                   100,78);
//    				 //File readfile = new File( "E:\\windfarmPhotos\\" + filelist[i]); 
//    				 
//    			 } catch(Exception e){
//    				 System.out.println(filelist[i]+"生成缩略图失败！");
//    				 continue;
//    			 }
//    			 
//    			 
//    		 }
//    	 }

     } 

}
