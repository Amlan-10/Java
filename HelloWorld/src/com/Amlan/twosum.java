package com.Amlan;
import java.util.Arrays;
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum1(nums, target)));
    }
    public static int[] twoSum1(int[] nums, int target) {
            int sum=0;
        int[] ans=new int [2];
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++) {
                    sum = nums[i] + nums[j];
                    if (sum == target) {
                        ans[0] = i;
                        ans[1] = j;
                    }
                }
            }
            return ans;
        }
    }

