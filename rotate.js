function rotate(nums: number[], k: number): void {
  k = k % nums.length;
  let l = 0;
  let r = nums.length - 1;
  nums = reverseArr(nums, l, r);

  l = 0;
  r = k - 1;
  nums = reverseArr(nums, l, r);

  l = k;
  r = nums.length - 1;
  nums = reverseArr(nums, l, r);
};

function reverseArr(nums: number[], l: number, r: number): number[] {
    while(l < r) {
    let temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;
    l++;
    r--;
  }

  return nums;
}
