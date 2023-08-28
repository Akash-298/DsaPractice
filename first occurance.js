/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    for(let i=0 ; i<haystack.length;i++){
let st = "";

        for(let j=i;j<haystack.length;j++){
            st = st+ haystack.charAt(j);
            if(st == needle) return i;
        }
    }

    return -1;
    
};
