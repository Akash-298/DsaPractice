var lengthOfLongestSubstring = function(s) {
    let set = new Set();
    let left=0,right=0;
    let longest=0;
    while(right < s.length){
        if(!set.has(s.charAt(right))){
            set.add(s.charAt(right))
            longest = Math.max(set.size,longest)
            right++;
        }else{
            set.delete(s.charAt(left));
            left++;
        }
    }
    return longest;
};
