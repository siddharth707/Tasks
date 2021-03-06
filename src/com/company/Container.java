package com.company;

public class Container {
    public int maxArea(int[] height) {

        int r= height.length-1;
        int maxarea = 0;

        for (int i = 0; i < height.length; i++)

            for (int j = i + 1; j < height.length; j++)

                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));

        return maxarea;
    }

}

