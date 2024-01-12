class Solution
{
    public:

    // Function to reverse first k elements of a queue.
    queue<int> modifyQueue(queue<int> q, int k) {
        queue<int> q2;
        stack<int> s;

        int n = q.size();

        for(int i = 0; i < n; i++){
            if(i < k)
                s.push(q.front());
            else
                q2.push(q.front());

            q.pop();
        }

        while(s.size()){
            q.push(s.top());
            s.pop();
        }

        while(q2.size()){
            q.push(q2.front());
            q2.pop();
        }

        return q;
    }
};
