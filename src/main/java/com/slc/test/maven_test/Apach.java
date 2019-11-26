package com.slc.test.maven_test;

import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum;


public class Apach {
	public double[] rd = new double [10];
	public int num;
	public void Indata(double a[] ,int n) {
		num=n;
		for(int i=0;i<n;i++) {
			rd[i]=a[i];
		}
		Print();
	}
	public void Random() {          //���������
	RandomGenerator rg = new JDKRandomGenerator();
	num=10;
	for(int i=0;i<num;i++){
		rd[i]=rg.nextInt(100);  //������100������
	}
	Print();
	}
	public double Getmin() {        //��ȡ��Сֵ
		double min = rd[0];
		for(int i=1;i<num;i++) {
			if(min>rd[i])
				min=rd[i];
		}
		return min;
	}
	public double Getmax() {        //��ȡ���ֵ
		double max = rd[0];
		for(int i=1;i<num;i++) {
			if(max<rd[i])
				max=rd[i];
		}
		return max;
	}
	public double Getsum() {         //��ȡ�ۼƺ�
		double sum = 0;
		for(int i=0;i<num;i++) {
			sum+=rd[i];
		}
		return sum;
	}
	public double Getmean() {       //��ȡƽ��ֵ
		double mean = 0;
		mean=Getsum()/(double)num;
		return mean;
	}
	public void Value() {
		Min min = new Min(); 
        Max max = new Max();
        Mean mean = new Mean(); // ����ƽ��ֵ 
        Sum sum = new Sum();  //���
        System.out.println("math3-min:" +min.evaluate(rd, 0, num)+"\t"+"min:"+Getmin()); 
        System.out.println("math3-max:" +max.evaluate(rd)+"\t"+"max:"+Getmax());
        System.out.println("math3-mean:" +mean.evaluate(rd,0,num)+"\t"+"mean:"+Getmean()); 
        System.out.println("math3-sum:" +sum.evaluate(rd)+"\t"+"sum:"+Getsum()); 
	}
	public void Sort() {        //�����㷨
		double temp=0;
		int n=num,b;
		for(int i=0;i<num;i++)
		{
			b=0;
			for(int j=1;j<n;j++)
			{
				if(rd[b]<rd[j])
				//if(rd[b]!=rd[j])
					b=j;
			}
			n--;
			temp=rd[n];
			rd[n]=rd[b];
			rd[b]=temp;
		}
		Print();
		System.out.println();
	}
	public void Print() {
	for(int i=0;i<num;i++){
	System.out.print(rd[i]+" ");
	}
	System.out.println();
	}
}

class Apachone extends Apach {
	public void Intdata() {
		RandomGenerator rg = new JDKRandomGenerator();
		num=10;
		for(int i=0;i<num;i++){
			rd[i]=rg.nextInt(100);  //������100������
		}
		Print();
	}
	public double Getmin_t() {        //��ȡ��Сֵ
		Min min = new Min(); 
		return min.evaluate(rd, 0, num);
	}
	public double Getmax_t() {        //��ȡ���ֵ
		Max max = new Max();
		return max.evaluate(rd);
	}
	public double Getsum_t() {         //��ȡ�ۼƺ�
		Sum sum = new Sum();  //���
		return sum.evaluate(rd);
	}
	public double Getmean_t() {       //��ȡƽ��ֵ
		Mean mean = new Mean(); // ����ƽ��ֵ 
		return mean.evaluate(rd);
	}
}

