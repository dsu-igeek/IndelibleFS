// Skeleton class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.igeekinc.indelible.indeliblefs.server;

public final class IndelibleFSObjectRemoteImpl_Skel
    implements java.rmi.server.Skeleton
{
    private static final java.rmi.server.Operation[] operations = {
	new java.rmi.server.Operation("java.util.HashMap getMetaDataResource(java.lang.String)"),
	new java.rmi.server.Operation("com.igeekinc.indelible.indeliblefs.remote.IndelibleFSObjectRemote getObjectForVersion(com.igeekinc.indelible.indeliblefs.core.IndelibleVersion, com.igeekinc.indelible.indeliblefs.core.RetrieveVersionFlags)"),
	new java.rmi.server.Operation("com.igeekinc.indelible.oid.IndelibleFSObjectID getObjectID()"),
	new java.rmi.server.Operation("com.igeekinc.indelible.indeliblefs.core.IndelibleVersion getVersion()"),
	new java.rmi.server.Operation("java.lang.String listMetaDataResources()[]"),
	new java.rmi.server.Operation("com.igeekinc.indelible.indeliblefs.core.IndelibleVersionIterator listVersions()"),
	new java.rmi.server.Operation("void release()"),
	new java.rmi.server.Operation("com.igeekinc.indelible.indeliblefs.remote.IndelibleFSObjectRemote setMetaDataResource(java.lang.String, java.util.HashMap)")
    };
    
    private static final long interfaceHash = -2698424356887516211L;
    
    public java.rmi.server.Operation[] getOperations() {
	return (java.rmi.server.Operation[]) operations.clone();
    }
    
    public void dispatch(java.rmi.Remote obj, java.rmi.server.RemoteCall call, int opnum, long hash)
	throws java.lang.Exception
    {
	if (hash != interfaceHash)
	    throw new java.rmi.server.SkeletonMismatchException("interface hash mismatch");
	
	com.igeekinc.indelible.indeliblefs.server.IndelibleFSObjectRemoteImpl server = (com.igeekinc.indelible.indeliblefs.server.IndelibleFSObjectRemoteImpl) obj;
	switch (opnum) {
	case 0: // getMetaDataResource(String)
	{
	    java.lang.String $param_String_1;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    java.util.HashMap $result = server.getMetaDataResource($param_String_1);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 1: // getObjectForVersion(IndelibleVersion, RetrieveVersionFlags)
	{
	    com.igeekinc.indelible.indeliblefs.core.IndelibleVersion $param_IndelibleVersion_1;
	    com.igeekinc.indelible.indeliblefs.core.RetrieveVersionFlags $param_RetrieveVersionFlags_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_IndelibleVersion_1 = (com.igeekinc.indelible.indeliblefs.core.IndelibleVersion) in.readObject();
		$param_RetrieveVersionFlags_2 = (com.igeekinc.indelible.indeliblefs.core.RetrieveVersionFlags) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    com.igeekinc.indelible.indeliblefs.remote.IndelibleFSObjectRemote $result = server.getObjectForVersion($param_IndelibleVersion_1, $param_RetrieveVersionFlags_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 2: // getObjectID()
	{
	    call.releaseInputStream();
	    com.igeekinc.indelible.oid.IndelibleFSObjectID $result = server.getObjectID();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 3: // getVersion()
	{
	    call.releaseInputStream();
	    com.igeekinc.indelible.indeliblefs.core.IndelibleVersion $result = server.getVersion();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 4: // listMetaDataResources()
	{
	    call.releaseInputStream();
	    java.lang.String[] $result = server.listMetaDataResources();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 5: // listVersions()
	{
	    call.releaseInputStream();
	    com.igeekinc.indelible.indeliblefs.core.IndelibleVersionIterator $result = server.listVersions();
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 6: // release()
	{
	    call.releaseInputStream();
	    server.release();
	    try {
		call.getResultStream(true);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	case 7: // setMetaDataResource(String, HashMap)
	{
	    java.lang.String $param_String_1;
	    java.util.HashMap $param_HashMap_2;
	    try {
		java.io.ObjectInput in = call.getInputStream();
		$param_String_1 = (java.lang.String) in.readObject();
		$param_HashMap_2 = (java.util.HashMap) in.readObject();
	    } catch (java.io.IOException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } catch (java.lang.ClassNotFoundException e) {
		throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
	    } finally {
		call.releaseInputStream();
	    }
	    com.igeekinc.indelible.indeliblefs.remote.IndelibleFSObjectRemote $result = server.setMetaDataResource($param_String_1, $param_HashMap_2);
	    try {
		java.io.ObjectOutput out = call.getResultStream(true);
		out.writeObject($result);
	    } catch (java.io.IOException e) {
		throw new java.rmi.MarshalException("error marshalling return", e);
	    }
	    break;
	}
	    
	default:
	    throw new java.rmi.UnmarshalException("invalid method number");
	}
    }
}
