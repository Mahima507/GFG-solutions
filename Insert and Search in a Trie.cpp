class Solution {
public:
    void insert(struct TrieNode *root, string key) {
        if (key.size() == 0) {
            root->isLeaf = true;
            return;
        }

        if (root->children[key[0] - 'a'] != NULL)
            insert(root->children[key[0] - 'a'], key.substr(1));
        else {
            root->children[key[0] - 'a'] = new TrieNode();
            insert(root->children[key[0] - 'a'], key.substr(1));
        }
    }

    bool search(struct TrieNode *root, string key) {
        if (key.size() == 0 && root->isLeaf == true)
            return true;

        if (root->children[key[0] - 'a'] != NULL)
            return search(root->children[key[0] - 'a'], key.substr(1));
        else
            return false;
    }
};
