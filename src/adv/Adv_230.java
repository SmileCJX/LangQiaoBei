package adv;

import java.util.Scanner;

public class Adv_230 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double [][] triangle = new double[3][2];
		
		for (int i = 0; i < triangle.length; i++) {
			triangle[i][0] = scanner.nextDouble();
			triangle[i][1] = scanner.nextDouble();
		}
		
		
		double perimeter = getPerimeter(triangle);
		double acreage = getAcreage(triangle);
		double[] excenter =  getExcenter(triangle);
		double[] barycenter = getBarycenter(triangle);
		System.out.format("%.2f\n", perimeter );
		System.out.format("%.2f\n", acreage);
		System.out.format("%.2f", excenter[0]);
		System.out.format(" %.2f\n", excenter[1]);
		System.out.format("%.2f", barycenter[0]);
		System.out.format(" %.2f\n", barycenter[1]);
	}

	/**
	 * ���������ε����
	 * @param triangle
	 * @return
	 */
	private static double getAcreage(double[][] triangle) {
		double [] edge = getABC( triangle );
		double p = (edge[0] + edge[1] + edge[2]) / 2;
		double acreage = Math.sqrt(
				/*���׹�ʽ begin */ 
				p * (p-edge[0]) * (p-edge[1]) * (p-edge[2])
				/*���׹�ʽ end   */);
		
		return acreage;
	}
	
	/**
	 * ���������ε����ģ�PS���������������ߵ����߽��㣩
	 * @param point
	 * @return
	 */
	public static double[] getBarycenter(double[][] point) {
        double[] center = new double[2];
        double x1 = point[0][0], y1 = point[0][1];
        double x2 = point[1][0], y2 = point[1][1];
        double x3 = point[2][0], y3 = point[2][1];
        center[0] = (x1 + x2 + x3) / 3;  //���ĵĺ�����
        center[1] = (y1 + y2 + y3) / 3;  //���ĵ�������
        return center;
    }

	/**
	 * ���������ε��ܳ�
	 * @param triangle
	 * @return
	 */
	private static double getPerimeter(double[][] triangle) {
		double result = 0;
		double [] edge = getABC( triangle );
		for (int i = 0; i < edge.length; i++) {
			result += edge[i];
		}
		return result;
	}
	
	/**
	 * ���������������ߵı߳�
	 * @param triangle
	 * @return
	 */
	public static double[] getABC(double[][] triangle){
		double [] edge = new double[3];
		double x1 = triangle[0][0];
		double y1 = triangle[0][1];
		
		double x2 = triangle[1][0];
		double y2 = triangle[1][1];
		
		double x3 = triangle[2][0];
		double y3 = triangle[2][1];
		
		edge[0] = getSqrt(x1,x2,y1,y2);
		edge[1] = getSqrt(x1, x3, y1, y3);
		edge[2] = getSqrt(x2, x3, y2, y3);
		
		return edge;
	}
	
	  //���������ε����ģ�PS�����������Բ��Բ�ģ����ĵ��������������ȣ�
    public static double[] getExcenter(double[][] triangle) {
        double[] center = new double[2];
        double x1 = triangle[0][0], y1 = triangle[0][1];
        double x2 = triangle[1][0], y2 = triangle[1][1];
        double x3 = triangle[2][0], y3 = triangle[2][1];
        double a , b , c , d ;
           a = (x1*x1 + y1*y1 - x2*x2 - y2*y2) * (x1 - x3) / 2;
           b = (x1*x1 + y1*y1 - x3*x3 - y3* y3) * (x1 - x2) / 2;
           c = (y1 - y2) * (x1 - x3);
           d = (y1 - y3) * (x1 - x2);
        center[1] = (a - b) / (c - d);  //���ĵ�������
        double e, f;
        if(x1 != x2) {   //��ֹ��������ĺ�������ȵ����
            e = (x1*x1 + y1*y1 - x2*x2 - y2*y2) / (2 * (x1 - x2));
            f = (y1 - y2) / (x1 - x2);
            center[0] = e - f * center[1];  //���ĵĺ�����
        } else if(x1 != x3) {
            e = (x1*x1 + y1*y1 - x3*x3 - y3*y3) / (2 * (x1 - x3));
            f = (y1 - y3) / (x1 - x3);
            center[0] = e - f * center[1];
        } else if(x2 != x3) {
            e = (x2*x2 + y2*y2 - x3*x3 - y3*y3) / (2 * (x2 - x3));
            f = (y2 - y3) / (x2 - x3);
            center[0] = e - f * center[1];
        }
        return center;  
    }

	/**
	 * �����ߵı߳�
	 * @param x1
	 * @param x2
	 * @param y1
	 * @param y2
	 * @return
	 */
	private static double getSqrt(double x1, double x2, double y1, double y2) {
		double squareNum =  (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		return Math.sqrt(squareNum);
	}
}
