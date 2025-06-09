def commit_callback(commit):
    if commit.author_name == b"mahalakshmi1613" or commit.author_email == b"mahalakshmi02042004@gmail.com":
        commit.skip()
