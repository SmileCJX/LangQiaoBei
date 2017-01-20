package test;
/*
 * 每个人从盒子中取出的球的数目必须是1,3,7或者8个。
 * 轮到某一方取球时不能弃权！
 * A先取球，然后双方交替取球，直到取完。
 * 被迫拿到最后一个球的一方为负方（输方）
 * 双方都不会做出错误的判断
 */
/*
 * f(局面 x)--->胜负？
 * 边界条件处理。。。
 * for(对我所有可能的走法{
 * 		试着走一步----->局面y
 * 		胜负 t= f(y);
 * 		if(t==负) return 胜
 * 		恢复局面
 * }
 * return 负
 */
public class Test8A {
	public static void main(String[] args) {
		System.out.println(f(10));
		System.out.println(f(1));
		System.out.println(f(4));
	}

	//局面：n 所剩球数目
	private static boolean f(int n) {
		if(n>=1 && f(n-1)==false) return true;
		if(n>=3 && f(n-3)==false) return true;
		if(n>=7 && f(n-7)==false) return true;
		if(n>=8 && f(n-8)==false) return true;
		return false;	//效率不高。用缓冲，已经计算过的局面保存
	}
}
