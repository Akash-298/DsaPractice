var myAtoi = function(s) {
    if (!s) return 0;
    let i = 0, n = s.length;
    while (i < n && s[i] === ' ') i++;
    if (i === n) return 0;
    let sign = s[i] === '-' ? -1 : 1;
    if (s[i] === '-' || s[i] === '+') i++;
    let res = 0;
    while (i < n && !isNaN(s[i]) && s[i] !== ' ') {
        res = res * 10 + parseInt(s[i]);
        i++;
    }
    return Math.max(-2**31, Math.min(sign * res,2**31-1));
};
