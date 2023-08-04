/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */


var twoSum = function(nums, target) {
    let ans = [];
    let obj = {};
    for (let i = 0; i < nums.length; i++) {
        let m = target - nums[i];
        if (obj[m] != undefined) {
            ans.push(i);
            ans.push(obj[m]);
            return ans;
        } else {
            obj[nums[i]] = i;
        }
    }
};
